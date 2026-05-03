package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorRegularIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 106.170 L 240.000 72.000 C 240.000 63.163 232.837 56.000 224.000 56.000 L 32.000 56.000 C 23.163 56.000 16.000 63.163 16.000 72.000 L 16.000 106.170 C 11.058 109.023 8.009 114.293 8.000 120.000 L 8.000 168.000 C 8.000 176.837 15.163 184.000 24.000 184.000 L 32.000 184.000 L 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 C 44.418 208.000 48.000 204.418 48.000 200.000 L 48.000 184.000 L 208.000 184.000 L 208.000 200.000 C 208.000 204.418 211.582 208.000 216.000 208.000 C 220.418 208.000 224.000 204.418 224.000 200.000 L 224.000 184.000 L 232.000 184.000 C 240.837 184.000 248.000 176.837 248.000 168.000 L 248.000 120.000 C 247.991 114.293 244.942 109.023 240.000 106.170 ZM 224.000 104.000 L 216.000 104.000 C 207.163 104.000 200.000 111.163 200.000 120.000 L 200.000 136.000 L 136.000 136.000 L 136.000 72.000 L 224.000 72.000 ZM 120.000 72.000 L 120.000 136.000 L 56.000 136.000 L 56.000 120.000 C 56.000 111.163 48.837 104.000 40.000 104.000 L 32.000 104.000 L 32.000 72.000 ZM 232.000 168.000 L 24.000 168.000 L 24.000 120.000 L 40.000 120.000 L 40.000 144.000 C 40.000 148.418 43.582 152.000 48.000 152.000 L 208.000 152.000 C 212.418 152.000 216.000 148.418 216.000 144.000 L 216.000 120.000 L 232.000 120.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _couch!!
    }

private var _couch: ImageVector? = null
