package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOpenai: ImageVector
    get() {
        if (_brandOpenai != null) return _brandOpenai!!
        _brandOpenai = tablerOutlineIcon(
            name = "BrandOpenai",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.217 19.384c.59 1.588 2.233 2.526 3.9 2.227 1.668-.299 2.882-1.75 2.883-3.444v-5.167L12 9.65")
            addPathData("M5.214 15.014c-1.082 1.305-1.073 3.197 .021 4.493 1.093 1.295 2.958 1.621 4.425 .773L14 17.746v-6.946")
            addPathData("M6 7.63C4.609 7.394 3.213 8.025 2.466 9.319c-.959 1.661-.39 3.786 1.271 4.745L8 16.578l6-3.348")
            addPathData("M12.783 4.616C12.193 3.028 10.55 2.09 8.883 2.389 7.215 2.688 6.001 4.139 6 5.833v5.067l6 3.45")
            addPathData("M18.786 8.986C19.868 7.681 19.859 5.789 18.765 4.493 17.672 3.198 15.808 2.873 14.34 3.72L10 6.254v6.946")
            addPathData("M18 16.302c1.391 .236 2.787-.395 3.534-1.689 .959-1.661 .39-3.786-1.271-4.745L15.955 7.354 10 10.774")
        }
        return _brandOpenai!!
    }

private var _brandOpenai: ImageVector? = null
