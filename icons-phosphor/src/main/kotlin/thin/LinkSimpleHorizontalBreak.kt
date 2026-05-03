package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorThinIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 128.000 C 20.028 152.289 39.711 171.972 64.000 172.000 L 104.000 172.000 C 106.209 172.000 108.000 173.791 108.000 176.000 C 108.000 178.209 106.209 180.000 104.000 180.000 L 64.000 180.000 C 35.281 180.000 12.000 156.719 12.000 128.000 C 12.000 99.281 35.281 76.000 64.000 76.000 L 104.000 76.000 C 106.209 76.000 108.000 77.791 108.000 80.000 C 108.000 82.209 106.209 84.000 104.000 84.000 L 64.000 84.000 C 39.711 84.028 20.028 103.711 20.000 128.000 ZM 192.000 76.000 L 152.000 76.000 C 149.791 76.000 148.000 77.791 148.000 80.000 C 148.000 82.209 149.791 84.000 152.000 84.000 L 192.000 84.000 C 216.301 84.000 236.000 103.699 236.000 128.000 C 236.000 152.301 216.301 172.000 192.000 172.000 L 152.000 172.000 C 149.791 172.000 148.000 173.791 148.000 176.000 C 148.000 178.209 149.791 180.000 152.000 180.000 L 192.000 180.000 C 220.719 180.000 244.000 156.719 244.000 128.000 C 244.000 99.281 220.719 76.000 192.000 76.000 Z"),
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
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
