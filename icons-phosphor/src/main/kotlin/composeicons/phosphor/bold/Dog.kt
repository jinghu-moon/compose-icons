package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = phosphorBoldIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 136c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM164 120c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM232.24 146.18c-2.64 1.207-5.507 1.838-8.41 1.85-1.286-.004-2.569-.135-3.83-.39v36.36c-.028 24.289-19.711 43.972-44 44h-96C55.711 227.972 36.028 208.289 36 184v-36.37c-1.267 .261-2.557 .391-3.85 .39-2.896-.008-5.756-.636-8.39-1.84C15.292 142.459 10.551 133.351 12.36 124.28l16.42-88c1.022-5.412 4.231-10.164 8.87-13.133 4.639-2.97 10.297-3.895 15.64-2.557l.47 .13 52 15.27h44.54l52-15.27 .47-.13c5.347-1.337 11.01-.408 15.649 2.568 4.64 2.976 7.846 7.735 8.861 13.152l16.42 88c1.785 9.076-2.981 18.172-11.46 21.87ZM172.24 54.55 217 112.42 204.44 45.09ZM39 112.42 83.76 54.55 51.56 45.09ZM196 184v-59.52L146.11 60h-36.22L60 124.48v59.52c0 11.046 8.954 20 20 20h36v-7L103.52 184.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 175l7.51-7.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L140 197v7h36c11.046 0 20-8.954 20-20Z"),
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
