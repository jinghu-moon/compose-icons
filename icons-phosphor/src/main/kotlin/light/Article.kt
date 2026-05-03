package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorLightIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 182.000 96.000 C 182.000 99.314 179.314 102.000 176.000 102.000 L 80.000 102.000 C 76.686 102.000 74.000 99.314 74.000 96.000 C 74.000 92.686 76.686 90.000 80.000 90.000 L 176.000 90.000 C 179.314 90.000 182.000 92.686 182.000 96.000 ZM 182.000 128.000 C 182.000 131.314 179.314 134.000 176.000 134.000 L 80.000 134.000 C 76.686 134.000 74.000 131.314 74.000 128.000 C 74.000 124.686 76.686 122.000 80.000 122.000 L 176.000 122.000 C 179.314 122.000 182.000 124.686 182.000 128.000 ZM 182.000 160.000 C 182.000 163.314 179.314 166.000 176.000 166.000 L 80.000 166.000 C 76.686 166.000 74.000 163.314 74.000 160.000 C 74.000 156.686 76.686 154.000 80.000 154.000 L 176.000 154.000 C 179.314 154.000 182.000 156.686 182.000 160.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _article!!
    }

private var _article: ImageVector? = null
