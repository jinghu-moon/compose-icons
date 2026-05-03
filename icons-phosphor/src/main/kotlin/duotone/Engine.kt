package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorDuotoneIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 248.000 120.000 L 248.000 168.000 C 248.000 172.418 244.418 176.000 240.000 176.000 L 224.000 176.000 L 186.340 213.660 C 184.841 215.157 182.809 215.999 180.690 216.000 L 103.310 216.000 C 101.191 215.999 99.159 215.157 97.660 213.660 L 58.340 174.340 C 56.843 172.841 56.001 170.809 56.000 168.690 L 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 L 180.690 72.000 C 182.809 72.001 184.841 72.843 186.340 74.340 L 224.000 112.000 L 240.000 112.000 C 244.418 112.000 248.000 115.582 248.000 120.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 240.000 104.000 L 227.310 104.000 L 192.000 68.690 C 189.010 65.676 184.936 63.986 180.690 64.000 L 140.000 64.000 L 140.000 40.000 L 164.000 40.000 C 168.418 40.000 172.000 36.418 172.000 32.000 C 172.000 27.582 168.418 24.000 164.000 24.000 L 100.000 24.000 C 95.582 24.000 92.000 27.582 92.000 32.000 C 92.000 36.418 95.582 40.000 100.000 40.000 L 124.000 40.000 L 124.000 64.000 L 64.000 64.000 C 55.163 64.000 48.000 71.163 48.000 80.000 L 48.000 132.000 L 24.000 132.000 L 24.000 108.000 C 24.000 103.582 20.418 100.000 16.000 100.000 C 11.582 100.000 8.000 103.582 8.000 108.000 L 8.000 172.000 C 8.000 176.418 11.582 180.000 16.000 180.000 C 20.418 180.000 24.000 176.418 24.000 172.000 L 24.000 148.000 L 48.000 148.000 L 48.000 168.690 C 47.986 172.936 49.676 177.010 52.690 180.000 L 92.000 219.310 C 94.990 222.324 99.064 224.014 103.310 224.000 L 180.690 224.000 C 184.936 224.014 189.010 222.324 192.000 219.310 L 227.310 184.000 L 240.000 184.000 C 248.837 184.000 256.000 176.837 256.000 168.000 L 256.000 120.000 C 256.000 111.163 248.837 104.000 240.000 104.000 ZM 240.000 168.000 L 224.000 168.000 C 221.878 167.998 219.842 168.840 218.340 170.340 L 180.690 208.000 L 103.310 208.000 L 64.000 168.690 L 64.000 80.000 L 180.690 80.000 L 218.340 117.660 C 219.842 119.160 221.878 120.002 224.000 120.000 L 240.000 120.000 Z"),
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
