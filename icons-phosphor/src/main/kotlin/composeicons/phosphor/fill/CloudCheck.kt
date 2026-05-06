package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorFillIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.93 124.52C246.11 77.54 207.07 40 160.06 40 126.707 40.005 96.217 58.844 81.29 88.67h0C75.207 100.794 72.027 114.166 72 127.73c.065 4.275-3.173 7.879-7.43 8.27-2.219 .158-4.403-.614-6.029-2.132C56.915 132.351 55.994 130.224 56 128c-.008-11.19 1.795-22.307 5.34-32.92 .476-1.386 .155-2.922-.835-4.002-.991-1.08-2.493-1.532-3.915-1.178C28.069 97.009 8.04 122.607 8 152c0 35.19 29.75 64 65 64h87c23.935-.026 46.828-9.79 63.414-27.045 16.586-17.256 25.437-40.518 24.516-64.435ZM197.66 117.66l-48 48c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L144 148.69l42.34-42.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
