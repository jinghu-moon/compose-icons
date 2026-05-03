package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorFillIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 136.000 143.280 L 136.000 144.000 C 136.000 148.418 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 148.418 120.000 144.000 L 120.000 136.000 C 120.000 131.582 123.582 128.000 128.000 128.000 C 141.230 128.000 152.000 119.000 152.000 108.000 C 152.000 97.000 141.230 88.000 128.000 88.000 C 114.770 88.000 104.000 97.000 104.000 108.000 L 104.000 112.000 C 104.000 116.418 100.418 120.000 96.000 120.000 C 91.582 120.000 88.000 116.418 88.000 112.000 L 88.000 108.000 C 88.000 88.150 105.940 72.000 128.000 72.000 C 150.060 72.000 168.000 88.150 168.000 108.000 C 168.000 125.380 154.230 139.930 136.000 143.280 ZM 140.000 180.000 C 140.000 186.627 134.627 192.000 128.000 192.000 C 121.373 192.000 116.000 186.627 116.000 180.000 C 116.000 173.373 121.373 168.000 128.000 168.000 C 134.627 168.000 140.000 173.373 140.000 180.000 Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
