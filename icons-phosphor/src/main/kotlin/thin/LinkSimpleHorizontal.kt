package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorThinIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 124.000 L 176.000 124.000 C 178.209 124.000 180.000 125.791 180.000 128.000 C 180.000 130.209 178.209 132.000 176.000 132.000 L 80.000 132.000 C 77.791 132.000 76.000 130.209 76.000 128.000 C 76.000 125.791 77.791 124.000 80.000 124.000 ZM 104.000 172.000 L 64.000 172.000 C 39.699 172.000 20.000 152.301 20.000 128.000 C 20.000 103.699 39.699 84.000 64.000 84.000 L 104.000 84.000 C 106.209 84.000 108.000 82.209 108.000 80.000 C 108.000 77.791 106.209 76.000 104.000 76.000 L 64.000 76.000 C 35.281 76.000 12.000 99.281 12.000 128.000 C 12.000 156.719 35.281 180.000 64.000 180.000 L 104.000 180.000 C 106.209 180.000 108.000 178.209 108.000 176.000 C 108.000 173.791 106.209 172.000 104.000 172.000 ZM 192.000 76.000 L 152.000 76.000 C 149.791 76.000 148.000 77.791 148.000 80.000 C 148.000 82.209 149.791 84.000 152.000 84.000 L 192.000 84.000 C 216.301 84.000 236.000 103.699 236.000 128.000 C 236.000 152.301 216.301 172.000 192.000 172.000 L 152.000 172.000 C 149.791 172.000 148.000 173.791 148.000 176.000 C 148.000 178.209 149.791 180.000 152.000 180.000 L 192.000 180.000 C 220.719 180.000 244.000 156.719 244.000 128.000 C 244.000 99.281 220.719 76.000 192.000 76.000 Z"),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
