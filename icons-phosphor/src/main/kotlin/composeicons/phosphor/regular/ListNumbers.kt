package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorRegularIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 4.418-3.582 8-8 8h-112c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8ZM104 72h112c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-112c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 184h-112c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h112c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM43.58 55.16 48 52.94v51.06c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64c.002-2.774-1.433-5.351-3.793-6.81-2.36-1.459-5.306-1.591-7.787-.35l-16 8c-3.954 1.977-5.557 6.786-3.58 10.74 1.977 3.954 6.786 5.557 10.74 3.58ZM79.77 156.72c-.894-6.402-4.361-12.163-9.6-15.95-10.79-7.835-25.841-5.761-34.11 4.7-1.521 1.953-2.726 4.133-3.57 6.46-1.201 2.73-.785 5.901 1.081 8.228 1.866 2.327 4.871 3.422 7.796 2.843 2.925-.58 5.286-2.738 6.123-5.6 .28-.767 .678-1.486 1.18-2.13 2.932-3.653 8.218-4.353 12-1.59 1.77 1.252 2.948 3.175 3.26 5.32 .285 2.06-.282 4.147-1.57 5.78-.029 .035-.056 .072-.08 .11L33.59 203.21c-1.813 2.426-2.101 5.667-.745 8.374 1.357 2.707 4.126 4.417 7.155 4.416h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16L75.08 174.47c3.909-5.034 5.602-11.442 4.69-17.75Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
