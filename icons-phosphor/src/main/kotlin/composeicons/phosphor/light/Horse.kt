package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorLightIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 100c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM230 129.45c-.92 54.911-45.036 99.296-99.94 100.55h-2.13C102.911 230.168 78.715 221.074 60 204.47c-1.655-1.414-2.415-3.613-1.985-5.746 .43-2.134 1.981-3.867 4.054-4.531 2.073-.663 4.343-.151 5.931 1.337 6.591 5.889 14.039 10.742 22.09 14.39l29-39.89C95.16 158.66 68.91 163.1 54.29 165.58c-11.285 1.971-22.702-2.692-29.38-12-.079-.103-.152-.209-.22-.32l-13.79-22c-.847-1.356-1.117-2.995-.751-4.551 .366-1.556 1.338-2.902 2.701-3.739L114 60.65v-28.65c0-3.314 2.686-6 6-6h8c27.305-.003 53.471 10.942 72.642 30.386 19.171 19.443 29.746 45.762 29.358 73.064ZM218 129.28c.343-24.09-8.988-47.313-25.904-64.469C175.181 47.655 152.093 37.998 128 38h-2v26c-.001 2.084-1.084 4.019-2.86 5.11L24.29 129.94l10.47 16.74c4.027 5.499 10.826 8.236 17.54 7.06 15.82-2.67 48.42-8.18 77.23 8.22C152.111 161.137 169.993 142.596 170 120c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6-.035 28.592-22.328 52.213-50.87 53.9l-29.36 40.37c9.104 2.669 18.564 3.927 28.05 3.73 48.438-1.12 87.356-40.276 88.18-88.72Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
