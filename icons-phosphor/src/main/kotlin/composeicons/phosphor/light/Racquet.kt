package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Racquet: ImageVector
    get() {
        if (_racquet != null) return _racquet!!
        _racquet = phosphorLightIcon(
            name = "Racquet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.53 27.47C201.38 .33 152.16 5.37 118.81 38.72 87.22 70.31 81.05 116.13 103.56 144L71.33 176.19l-2.1-2.11c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L22.1 201.41c-2.626 2.626-4.101 6.187-4.101 9.9 0 3.713 1.475 7.274 4.101 9.9l12.69 12.7c2.626 2.629 6.189 4.106 9.905 4.106 3.716 0 7.279-1.477 9.905-4.106h0L81.92 206.59c2.629-2.626 4.106-6.189 4.106-9.905 0-3.716-1.477-7.279-4.106-9.905l-2.1-2.1L112 152.46c11.17 9 25.24 13.45 40.13 13.45 22.2 0 46.21-9.81 65.12-28.72C250.63 103.84 255.67 54.62 228.53 27.47ZM73.43 198.09 46.11 225.42c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L30.59 212.73c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415L57.91 182.57c.377-.374 .888-.583 1.42-.58 .528-0 1.035 .208 1.41 .58l6.35 6.34h0l6.34 6.34c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415ZM232.34 58h-34.28v-34.34c16.986 4.069 30.24 17.347 34.28 34.34ZM183.9 22c.72 0 1.44 0 2.15 0v36h-36.05v-27.43c10.458-5.521 22.075-8.486 33.9-8.65ZM186.05 70v36h-36.05v-36ZM127.3 47.21C130.629 43.874 134.206 40.795 138 38v20h-20c2.821-3.828 5.93-7.436 9.3-10.79ZM110.65 70h27.35v36h-36c-.34-11.72 2.58-24.21 8.65-36ZM103.75 118h34.25v34.28C121.041 148.211 107.805 134.962 103.75 118ZM150.04 154v-36h36v27.38c-11.83 6.04-24.32 8.96-36.04 8.55ZM208.79 128.77c-3.338 3.341-6.925 6.423-10.73 9.22v-19.99h19.94c-2.798 3.792-5.876 7.369-9.21 10.7ZM225.44 106h-27.38v-36h36c.37 11.63-2.55 24.12-8.62 36Z"),
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
        return _racquet!!
    }

private var _racquet: ImageVector? = null
