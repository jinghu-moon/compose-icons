package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorFillIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 128c0 22.091-17.909 40-40 40C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40ZM208 128c.024-19.681-7.231-38.676-20.37-53.33-1.892-2.183-4.814-3.176-7.644-2.598-2.83 .577-5.129 2.635-6.015 5.385-.886 2.749-.221 5.763 1.739 7.884 21.728 24.294 21.728 61.036 0 85.33-2.862 3.301-2.546 8.287 .709 11.201 3.255 2.914 8.246 2.677 11.211-.531C200.767 166.681 208.022 147.684 208 128ZM80.29 85.34c1.96-2.121 2.625-5.135 1.739-7.884-.886-2.749-3.185-4.807-6.015-5.385-2.83-.577-5.752 .416-7.644 2.598-27.191 30.358-27.191 76.312 0 106.67 2.965 3.208 7.956 3.445 11.211 .531 3.255-2.914 3.571-7.9 .709-11.201-21.75-24.285-21.75-61.045 0-85.33ZM238.57 81.34C232.715 67.435 224.28 54.765 213.71 44c-1.983-2.12-4.96-3-7.777-2.298-2.817 .702-5.033 2.875-5.79 5.678-.757 2.803 .065 5.796 2.146 7.82 39.666 40.413 39.666 105.147 0 145.56-3.104 3.154-3.064 8.226 .09 11.33 3.154 3.104 8.226 3.064 11.33-.09 33.864-34.582 43.665-86.111 24.86-130.71ZM32.17 168.48C15.824 129.84 24.321 85.162 53.71 55.22c3.098-3.154 3.054-8.222-.1-11.32C50.456 40.802 45.388 40.846 42.29 44c-45.807 46.633-45.807 121.367 0 168 1.983 2.12 4.96 3 7.777 2.298 2.817-.702 5.033-2.875 5.79-5.678 .757-2.803-.065-5.796-2.146-7.82C44.557 191.481 37.248 180.515 32.17 168.48Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
