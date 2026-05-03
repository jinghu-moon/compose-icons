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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.453 8.056 C 11.453 7.433 11.971 7.077 12.895 7.077 C 14.585 7.077 16.305 7.420 17.500 8.000 L 18.000 4.000 C 17.052 3.551 15.180 3.000 12.500 3.000 C 10.605 3.000 9.127 3.087 8.000 4.000 C 6.828 4.956 6.000 6.330 6.000 8.000 C 6.000 11.030 7.958 12.906 11.000 14.000 C 12.961 14.690 14.000 14.743 14.000 15.500 C 14.000 16.235 13.149 17.000 12.000 17.000 C 10.577 17.000 8.037 16.391 6.500 15.500 L 6.000 19.500 C 7.321 20.234 9.474 21.000 12.000 21.000 C 14.000 21.000 15.957 20.532 17.084 19.640 C 18.347 18.661 19.000 17.372 19.000 15.500 C 19.000 12.404 17.085 10.953 14.000 9.863 C 12.354 9.258 11.456 8.793 11.456 8.056 L 11.453 8.056"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandStripe!!
    }

private var _brandStripe: ImageVector? = null
