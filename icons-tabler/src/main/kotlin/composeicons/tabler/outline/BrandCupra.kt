package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCupra: ImageVector
    get() {
        if (_brandCupra != null) return _brandCupra!!
        _brandCupra = tablerOutlineIcon(
            name = "BrandCupra",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.5 10 2 6l15.298 6.909c.052 .023 .091 .068 .108 .121 .017 .054 .011 .113-.018 .162L14 19")
            addPathData("M10 19 6.612 13.192c-.029-.049-.035-.108-.018-.162 .017-.054 .056-.098 .108-.121L22 6l-2.5 4")
        }
        return _brandCupra!!
    }

private var _brandCupra: ImageVector? = null
