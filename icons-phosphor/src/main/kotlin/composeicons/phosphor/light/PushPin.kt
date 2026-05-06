package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorLightIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.91 82.79 173.22 22.1c-2.626-2.629-6.189-4.106-9.905-4.106-3.716 0-7.279 1.477-9.905 4.106L98.93 76.77c-9.52-3.25-34-8.34-59.71 12.41-3.101 2.493-4.995 6.187-5.209 10.16-.214 3.973 1.273 7.849 4.089 10.66l49.71 49.71-44.05 44c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L96.29 168.14 146 217.89c2.624 2.629 6.185 4.108 9.9 4.11q.49 0 1 0c4.038-.287 7.754-2.307 10.19-5.54 19.72-26.21 17.15-47.23 12.46-59.3l54.37-54.55c2.631-2.628 4.108-6.194 4.106-9.912-.002-3.718-1.483-7.283-4.116-9.908ZM225.42 94.1h0l-57.27 57.46c-1.819 1.828-2.266 4.614-1.11 6.92 9.94 19.88-1.71 40.32-9.54 50.72-.35 .457-.88 .741-1.455 .779-.574 .038-1.138-.173-1.545-.579L46.58 101.51c-.409-.405-.623-.966-.589-1.541 .034-.574 .315-1.106 .769-1.459C59.26 88.42 71.26 85.75 80.46 85.75c5.926-.089 11.804 1.073 17.25 3.41 2.319 1.148 5.112 .68 6.93-1.16L161.9 30.59c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l60.69 60.68c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
