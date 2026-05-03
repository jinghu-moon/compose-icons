package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorThinIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 168.000 L 180.000 184.000 C 180.000 186.209 178.209 188.000 176.000 188.000 C 173.791 188.000 172.000 186.209 172.000 184.000 L 172.000 168.000 C 172.000 143.699 152.301 124.000 128.000 124.000 C 103.699 124.000 84.000 143.699 84.000 168.000 L 84.000 184.000 C 84.000 186.209 82.209 188.000 80.000 188.000 C 77.791 188.000 76.000 186.209 76.000 184.000 L 76.000 168.000 C 76.000 139.281 99.281 116.000 128.000 116.000 C 156.719 116.000 180.000 139.281 180.000 168.000 ZM 128.000 84.000 C 81.629 84.050 44.050 121.629 44.000 168.000 L 44.000 184.000 C 44.000 186.209 45.791 188.000 48.000 188.000 C 50.209 188.000 52.000 186.209 52.000 184.000 L 52.000 168.000 C 52.000 126.026 86.026 92.000 128.000 92.000 C 169.974 92.000 204.000 126.026 204.000 168.000 L 204.000 184.000 C 204.000 186.209 205.791 188.000 208.000 188.000 C 210.209 188.000 212.000 186.209 212.000 184.000 L 212.000 168.000 C 211.950 121.629 174.371 84.050 128.000 84.000 ZM 128.000 52.000 C 63.965 52.072 12.072 103.965 12.000 168.000 L 12.000 184.000 C 12.000 186.209 13.791 188.000 16.000 188.000 C 18.209 188.000 20.000 186.209 20.000 184.000 L 20.000 168.000 C 20.000 108.353 68.353 60.000 128.000 60.000 C 187.647 60.000 236.000 108.353 236.000 168.000 L 236.000 184.000 C 236.000 186.209 237.791 188.000 240.000 188.000 C 242.209 188.000 244.000 186.209 244.000 184.000 L 244.000 168.000 C 243.928 103.965 192.035 52.072 128.000 52.000 Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
