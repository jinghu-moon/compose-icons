package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorBoldIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M99.69 51.88C96.958 49.596 93.353 48.644 89.85 49.28L29.85 60.19C24.144 61.229 19.998 66.2 20 72v36c0 6.627 5.373 12 12 12h60c6.627 0 12-5.373 12-12v-46.91c-.001-3.557-1.579-6.931-4.31-9.21ZM80 96h-36v-14L80 75.46ZM215.69 30.79c-2.732-2.284-6.337-3.236-9.84-2.6L129.85 42c-5.71 1.04-9.857 6.017-9.85 11.82v54.18c0 6.627 5.373 12 12 12h76c6.627 0 12-5.373 12-12v-68c-.001-3.557-1.579-6.931-4.31-9.21ZM196 96h-52v-32.17l52-9.45ZM92 136h-60c-6.627 0-12 5.373-12 12v36c-.002 5.8 4.144 10.771 9.85 11.81l60 10.91c3.502 .638 7.106-.312 9.839-2.593 2.733-2.281 4.312-5.657 4.311-9.217v-46.91c0-6.627-5.373-12-12-12ZM80 180.53 44 174v-14h36ZM208 136h-76c-6.627 0-12 5.373-12 12v54.18c-.007 5.803 4.14 10.78 9.85 11.82l76 13.82c3.504 .638 7.11-.313 9.843-2.596 2.733-2.283 4.311-5.662 4.307-9.224v-68c0-6.627-5.373-12-12-12ZM196 201.62l-52-9.45v-32.17h52Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
