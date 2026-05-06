package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorBoldIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 180c.002 16.253-9.831 30.892-24.878 37.036-15.047 6.144-32.316 2.573-43.692-9.036-3.119-3.038-4.348-7.528-3.21-11.731 1.137-4.203 4.462-7.46 8.688-8.511 4.226-1.051 8.689 .27 11.662 3.451 5.085 5.179 13.019 6.286 19.328 2.697 6.309-3.589 9.411-10.975 7.558-17.992C225.603 168.897 219.258 164.006 212 164c-4.474-.001-8.576-2.49-10.642-6.458-2.066-3.968-1.753-8.756 .812-12.422L217 124h-25c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h48c4.474 .001 8.576 2.49 10.642 6.458 2.066 3.968 1.753 8.756-.812 12.422l-18.34 26.2c12.659 7.063 20.506 20.423 20.51 34.92ZM144 44c-6.627 0-12 5.373-12 12v48h-80v-48C52 49.373 46.627 44 40 44 33.373 44 28 49.373 28 56v120c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48h80v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-120c0-6.627-5.373-12-12-12Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
