package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorFillIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 224c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM232 64v112c0 13.255-10.745 24-24 24h-160C34.745 200 24 189.255 24 176v-112C24 50.745 34.745 40 48 40h160c13.255 0 24 10.745 24 24ZM164 120c-.001-2.609-1.273-5.053-3.41-6.55l-40-28c-2.443-1.712-5.636-1.922-8.282-.545C109.661 86.282 108.001 89.017 108 92v56c.001 2.983 1.661 5.718 4.308 7.095 2.646 1.377 5.839 1.167 8.282-.545l40-28c2.137-1.497 3.409-3.941 3.41-6.55Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
