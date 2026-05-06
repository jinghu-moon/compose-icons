package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorBoldIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM164 152c.002 16.253-9.831 30.892-24.878 37.036-15.047 6.144-32.316 2.573-43.692-9.036-3.119-3.038-4.348-7.528-3.21-11.731 1.137-4.203 4.462-7.46 8.688-8.511 4.226-1.051 8.689 .27 11.662 3.451 5.085 5.179 13.019 6.286 19.328 2.697 6.309-3.589 9.411-10.975 7.558-17.992C137.603 140.897 131.258 136.006 124 136c-4.474-.001-8.576-2.49-10.642-6.458-2.066-3.968-1.753-8.756 .812-12.422L129 96h-25C97.373 96 92 90.627 92 84c0-6.627 5.373-12 12-12h48c4.474 .001 8.576 2.49 10.642 6.458 2.066 3.968 1.753 8.756-.812 12.422l-18.34 26.2c12.659 7.063 20.506 20.423 20.51 34.92Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
