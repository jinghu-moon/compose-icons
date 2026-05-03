package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartHandshake: ImageVector
    get() {
        if (_heartHandshake != null) return _heartHandshake!!
        _heartHandshake = lucideOutlineIcon(
            name = "HeartHandshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.414 14.414 C 21.000 12.828 22.000 11.500 22.000 9.500 C 22.000 7.222 20.596 5.180 18.468 4.364 C 16.341 3.549 13.932 4.130 12.409 5.824 C 12.179 6.039 11.822 6.039 11.591 5.825 C 10.069 4.131 7.659 3.550 5.532 4.365 C 3.405 5.180 2.000 7.222 2.000 9.500 C 2.000 11.800 3.500 13.500 5.000 15.000 L 10.535 20.362 C 10.905 20.760 11.420 20.990 11.963 21.000 C 12.506 21.009 13.030 20.798 13.414 20.414 C 13.812 20.016 14.035 19.476 14.034 18.913 C 14.033 18.350 13.809 17.811 13.410 17.414 C 13.936 17.996 14.740 18.240 15.501 18.050 C 16.262 17.860 16.856 17.266 17.046 16.505 C 17.236 15.744 16.992 14.940 16.410 14.414 C 16.808 14.812 17.349 15.036 17.912 15.036 C 18.475 15.036 19.016 14.812 19.414 14.414 C 20.195 13.633 20.195 12.367 19.414 11.586 L 17.533 9.704 C 17.081 9.252 16.468 8.998 15.828 8.998 C 15.189 8.998 14.576 9.252 14.124 9.704 L 12.414 11.414 C 11.633 12.195 10.367 12.195 9.586 11.414 C 8.805 10.633 8.805 9.367 9.586 8.586 L 12.409 5.824"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _heartHandshake!!
    }

private var _heartHandshake: ImageVector? = null
