package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) return _plugsConnected!!
        _plugsConnected = phosphorBoldIcon(
            name = "PlugsConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 15.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L173.94 65.09l-2.54-2.55c-14.07-14.03-36.84-14.03-50.91 0L100 83 96.49 79.48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L83 100 62.54 120.49c-14.058 14.059-14.058 36.851 0 50.91l2.55 2.54L15.51 223.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L82.08 190.93l2.54 2.55c14.072 14.025 36.838 14.025 50.91 0L156 173l3.51 3.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L173 156l20.49-20.49c14.058-14.059 14.058-36.851 0-50.91l-2.55-2.54L240.52 32.49c2.249-2.255 3.51-5.311 3.504-8.496-.006-3.185-1.277-6.237-3.534-8.484ZM118.54 176.51c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L79.51 154.43c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L100 117l39 39ZM176.54 118.56h0L156 139 117 100 137.49 79.51c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l22.06 22.06c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5ZM85.27 33.37C82.42 27.462 84.841 20.36 90.707 17.424c5.866-2.936 13.002-.617 16.023 5.206l8 16c1.993 3.842 1.762 8.46-.604 12.085-2.366 3.625-6.501 5.694-10.821 5.415C98.986 55.852 95.151 53.269 93.27 49.37ZM17.27 90.63c2.966-5.925 10.174-8.325 16.1-5.36l16 8c3.899 1.881 6.482 5.716 6.761 10.035 .279 4.32-1.791 8.455-5.415 10.821-3.625 2.366-8.243 2.597-12.085 .604l-16-8C16.705 103.764 14.305 96.556 17.27 90.63ZM238.73 165.37c-2.966 5.925-10.174 8.325-16.1 5.36l-16-8c-5.823-3.02-8.141-10.157-5.206-16.023 2.936-5.866 10.038-8.288 15.946-5.437l16 8c5.925 2.966 8.325 10.174 5.36 16.1ZM170.73 222.63c1.993 3.842 1.762 8.46-.604 12.085-2.366 3.625-6.501 5.694-10.821 5.415-4.32-.279-8.154-2.862-10.035-6.761l-8-16c-2.85-5.908-.429-13.01 5.437-15.946 5.866-2.936 13.002-.617 16.023 5.206Z"),
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
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
