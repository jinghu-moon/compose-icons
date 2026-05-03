package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorFillIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 120.000 L 256.000 168.000 C 256.000 176.837 248.837 184.000 240.000 184.000 L 227.310 184.000 L 192.000 219.310 C 189.010 222.324 184.936 224.014 180.690 224.000 L 103.310 224.000 C 99.064 224.014 94.990 222.324 92.000 219.310 L 52.690 180.000 C 49.676 177.010 47.986 172.936 48.000 168.690 L 48.000 148.000 L 24.000 148.000 L 24.000 172.000 C 24.000 176.418 20.418 180.000 16.000 180.000 C 11.582 180.000 8.000 176.418 8.000 172.000 L 8.000 108.000 C 8.000 103.582 11.582 100.000 16.000 100.000 C 20.418 100.000 24.000 103.582 24.000 108.000 L 24.000 132.000 L 48.000 132.000 L 48.000 80.000 C 48.000 71.163 55.163 64.000 64.000 64.000 L 124.000 64.000 L 124.000 40.000 L 100.000 40.000 C 95.582 40.000 92.000 36.418 92.000 32.000 C 92.000 27.582 95.582 24.000 100.000 24.000 L 164.000 24.000 C 168.418 24.000 172.000 27.582 172.000 32.000 C 172.000 36.418 168.418 40.000 164.000 40.000 L 140.000 40.000 L 140.000 64.000 L 180.690 64.000 C 184.936 63.986 189.010 65.676 192.000 68.690 L 227.310 104.000 L 240.000 104.000 C 248.837 104.000 256.000 111.163 256.000 120.000 Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
