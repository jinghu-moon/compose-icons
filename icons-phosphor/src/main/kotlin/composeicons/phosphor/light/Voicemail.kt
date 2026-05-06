package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorLightIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 74c-22.875 .022-43.254 14.454-50.869 36.024-7.615 21.57-.812 45.598 16.979 59.976h-76.22c20.459-16.534 26.028-45.404 13.187-68.361C90.236 78.681 62.721 68.317 37.925 77.097 13.128 85.877-1.734 111.247 2.733 137.169 7.2 163.092 29.695 182.025 56 182h144c29.823 0 54-24.177 54-54C254 98.177 229.823 74 200 74ZM14 128C14 104.804 32.804 86 56 86c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42C32.804 170 14 151.196 14 128ZM200 170c-23.196 0-42-18.804-42-42 0-23.196 18.804-42 42-42 23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42Z"),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
