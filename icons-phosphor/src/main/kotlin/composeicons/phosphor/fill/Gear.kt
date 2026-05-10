package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gear: ImageVector
    get() {
        if (_gear != null) return _gear!!
        _gear = phosphorFillIcon(
            name = "Gear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 130.16q.06-2.16 0-4.32l14.92-18.64c1.587-1.985 2.136-4.605 1.48-7.06C229.95 90.947 226.291 82.121 221.52 73.89c-1.268-2.183-3.492-3.64-6-3.93L191.8 67.32q-1.48-1.56-3-3L186 40.54c-.292-2.51-1.753-4.735-3.94-6C173.83 29.772 165.003 26.12 155.81 23.68c-2.455-.656-5.075-.107-7.06 1.48L130.16 40q-2.16 0-4.32 0L107.2 25.11c-1.985-1.587-4.605-2.136-7.06-1.48C90.947 26.08 82.121 29.739 73.89 34.51c-2.183 1.268-3.64 3.492-3.93 6L67.32 64.27q-1.56 1.49-3 3L40.54 70c-2.51 .292-4.735 1.753-6 3.94-4.767 8.232-8.422 17.058-10.87 26.25-.653 2.456-.1 5.077 1.49 7.06L40 125.84q0 2.16 0 4.32L25.11 148.8c-1.587 1.985-2.136 4.605-1.48 7.06 2.45 9.193 6.109 18.019 10.88 26.25 1.268 2.183 3.492 3.64 6 3.93l23.72 2.64q1.49 1.56 3 3L70 215.46c.292 2.51 1.753 4.734 3.94 6 8.232 4.767 17.058 8.422 26.25 10.87 2.456 .653 5.077 .1 7.06-1.49L125.84 216q2.16 .06 4.32 0l18.64 14.92c1.985 1.587 4.605 2.136 7.06 1.48 9.194-2.446 18.021-6.105 26.25-10.88 2.183-1.268 3.64-3.492 3.93-6l2.64-23.72q1.56-1.48 3-3L215.46 186c2.51-.292 4.734-1.753 6-3.94 4.767-8.232 8.422-17.058 10.87-26.25 .653-2.456 .1-5.077-1.49-7.06ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _gear!!
    }

private var _gear: ImageVector? = null
