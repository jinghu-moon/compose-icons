package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorFillIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM182.59 69c3.311-2.924 8.365-2.61 11.29 .7 7.858 8.868 13.844 19.232 17.6 30.47 1.403 4.192-.858 8.727-5.05 10.13-4.192 1.403-8.727-.858-10.13-5.05-3.061-9.221-7.96-17.726-14.4-25-2.899-3.303-2.591-8.326 .69-11.25ZM73.41 187.05c-3.311 2.924-8.365 2.61-11.29-.7C54.262 177.482 48.276 167.118 44.52 155.88c-1.403-4.192 .858-8.727 5.05-10.13 4.192-1.403 8.727 .858 10.13 5.05 3.067 9.203 7.965 17.69 14.4 24.95 1.408 1.589 2.127 3.673 1.997 5.793-.129 2.12-1.096 4.101-2.687 5.507ZM74.1 80.25c-6.44 7.274-11.339 15.779-14.4 25-1.403 4.192-5.938 6.453-10.13 5.05-4.192-1.403-6.453-5.938-5.05-10.13C48.276 88.932 54.262 78.568 62.12 69.7 65.047 66.386 70.106 66.073 73.42 69c3.314 2.927 3.627 7.986 .7 11.3ZM145.59 214.25c-11.607 2.373-23.573 2.373-35.18 0-4.291-.915-7.045-5.115-6.173-9.414 .872-4.3 5.044-7.095 9.353-6.266 9.509 1.94 19.311 1.94 28.82 0 4.308-.829 8.481 1.966 9.353 6.266 .872 4.3-1.882 8.5-6.173 9.414ZM151.84 51.25c-.777 3.709-4.05 6.365-7.84 6.36-.537 .001-1.074-.052-1.6-.16-9.509-1.94-19.311-1.94-28.82 0-2.814 .6-5.733-.358-7.645-2.507-1.912-2.15-2.523-5.16-1.599-7.885 .924-2.725 3.239-4.744 6.064-5.288 11.607-2.37 23.573-2.37 35.18 0 2.081 .42 3.91 1.649 5.084 3.418 1.174 1.769 1.597 3.932 1.176 6.012ZM211.48 155.93c-3.755 11.238-9.742 21.602-17.6 30.47-2.927 3.314-7.986 3.627-11.3 .7-3.314-2.927-3.627-7.986-.7-11.3 6.435-7.26 11.333-15.747 14.4-24.95 1.403-4.192 5.938-6.453 10.13-5.05 4.192 1.403 6.453 5.938 5.05 10.13Z"),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
