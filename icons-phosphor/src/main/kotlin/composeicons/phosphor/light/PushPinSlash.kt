package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorLightIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L71.27 74.51C61.78 76 50.6 80 39.22 89.18c-3.101 2.493-4.995 6.187-5.209 10.16-.214 3.973 1.273 7.849 4.089 10.66l49.71 49.71-44.05 44c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L96.29 168.14 146 217.89c2.624 2.629 6.185 4.108 9.9 4.11q.49 0 1 0c4.038-.287 7.754-2.307 10.19-5.54 5.287-6.935 9.482-14.637 12.44-22.84l24 26.45c1.433 1.625 3.631 2.351 5.75 1.899 2.119-.451 3.83-2.01 4.476-4.078 .647-2.068 .128-4.323-1.356-5.901ZM157.49 209.21c-.35 .457-.88 .741-1.455 .779-.574 .038-1.138-.173-1.545-.579L46.58 101.51c-.409-.405-.623-.966-.589-1.541 .034-.574 .315-1.106 .769-1.459C59.94 87.87 72.6 85.61 81.55 85.81L170 183.11c-2.17 10.63-7.89 19.96-12.51 26.1ZM233.91 102.59l-44.65 44.78c-1.509 1.539-3.727 2.15-5.811 1.601-2.084-.549-3.714-2.173-4.27-4.255-.556-2.082 .047-4.302 1.581-5.817L225.41 94.11c.379-.376 .592-.887 .592-1.42 0-.533-.213-1.044-.592-1.42L164.73 30.59c-.375-.376-.884-.587-1.415-.587-.531 0-1.04 .211-1.415 .587L120.68 71.94c-2.344 2.316-6.117 2.307-8.451-.019-2.334-2.326-2.356-6.099-.049-8.451L153.41 22.11c2.626-2.629 6.189-4.106 9.905-4.106 3.716 0 7.279 1.477 9.905 4.106l60.69 60.69c5.461 5.466 5.461 14.324 0 19.79Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
