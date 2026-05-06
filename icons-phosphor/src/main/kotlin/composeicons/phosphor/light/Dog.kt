package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = phosphorLightIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM164 130c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM229.77 140.72c-1.849 .846-3.857 1.285-5.89 1.29-3.732-.008-7.299-1.535-9.88-4.23v46.22c0 20.987-17.013 38-38 38h-96C59.013 222 42 204.987 42 184v-46.22c-2.588 2.69-6.157 4.213-9.89 4.22-2.03-.006-4.034-.446-5.88-1.29-5.933-2.605-9.26-8.983-8-15.34L34.65 37.37c.711-3.792 2.956-7.123 6.205-9.205 3.248-2.082 7.212-2.732 10.955-1.795l.24 .07L104.86 42h46.28L203.93 26.49l.24-.07c3.743-.937 7.707-.288 10.955 1.795 3.248 2.082 5.493 5.413 6.205 9.205l16.42 88c1.246 6.339-2.069 12.694-7.98 15.3ZM93.88 51.27 48.84 38c-.513-.12-1.052-.023-1.49 .27-.463 .3-.781 .778-.88 1.32L30.05 127.59c-.175 .908 .294 1.817 1.136 2.199 .841 .383 1.835 .139 2.404-.589ZM202 184v-61.57L149.06 54h-42.12L54 122.43v61.57c0 14.359 11.641 26 26 26h42v-15.52L107.76 180.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 183.51l11.76-11.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L134 194.48v15.52h42c14.359 0 26-11.641 26-26ZM226 127.6l-16.42-88c-.101-.539-.42-1.012-.88-1.31-.445-.275-.977-.371-1.49-.27l-45 13.23 60.32 78c.591 .666 1.551 .861 2.355 .479 .804-.382 1.259-1.25 1.115-2.129Z"),
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
        return _dog!!
    }

private var _dog: ImageVector? = null
