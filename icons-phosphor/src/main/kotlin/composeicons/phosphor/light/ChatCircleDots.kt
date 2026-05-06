package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorLightIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 128c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM84 118c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM172 118c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM230 128c.008 35.972-18.934 69.289-49.849 87.681-30.915 18.392-69.232 19.14-100.841 1.969L44.44 229.27c-5.031 1.678-10.578 .369-14.329-3.381-3.75-3.75-5.059-9.297-3.381-14.329L38.35 176.69C18.056 139.294 23.107 93.23 51.021 61.12 78.935 29.01 123.848 17.599 163.704 32.492 203.559 47.385 229.984 85.453 230 128ZM218 128C217.991 90.161 194.315 56.369 158.754 43.439 123.194 30.509 83.343 41.203 59.032 70.199 34.722 99.195 31.144 140.3 50.08 173.06c.863 1.489 1.045 3.277 .5 4.91L38.12 215.35c-.24 .719-.053 1.511 .483 2.047 .536 .536 1.328 .723 2.047 .483L78 205.42c.613-.202 1.254-.306 1.9-.31 1.053 .006 2.087 .285 3 .81 27.849 16.126 62.189 16.156 90.065 .078C200.842 189.92 218.013 160.181 218 128Z"),
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
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
