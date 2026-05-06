package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStripe: ImageVector
    get() {
        if (_brandStripe != null) return _brandStripe!!
        _brandStripe = tablerOutlineIcon(
            name = "BrandStripe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.453 8.056c0-.623 .518-.979 1.442-.979 1.69 0 3.41 .343 4.605 .923L18 4C17.052 3.551 15.18 3 12.5 3 10.605 3 9.127 3.087 8 4 6.828 4.956 6 6.33 6 8c0 3.03 1.958 4.906 5 6 1.961 .69 3 .743 3 1.5C14 16.235 13.149 17 12 17 10.577 17 8.037 16.391 6.5 15.5l-.5 4C7.321 20.234 9.474 21 12 21c2 0 3.957-.468 5.084-1.36C18.347 18.661 19 17.372 19 15.5 19 12.404 17.085 10.953 14 9.863 12.354 9.258 11.456 8.793 11.456 8.056h-.003"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandStripe!!
    }

private var _brandStripe: ImageVector? = null
