package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorBoldIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 52h-25.58L170 33.34C167.771 29.998 164.017 27.994 160 28h-64c-4.017-.006-7.771 1.998-10 5.34L73.57 52h-25.57C32.536 52 20 64.536 20 80v112c0 15.464 12.536 28 28 28h160c15.464 0 28-12.536 28-28v-112C236 64.536 223.464 52 208 52ZM212 192c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h32c4.017 .006 7.771-1.998 10-5.34L102.42 52h51.15L166 70.66c2.229 3.342 5.983 5.346 10 5.34h32c2.209 0 4 1.791 4 4ZM180 100v20c0 6.627-5.373 12-12 12h-20c-5.027-.007-9.517-3.146-11.249-7.865-1.732-4.719-.34-10.018 3.489-13.275-9.419-4.569-20.599-3.517-29 2.73-5.299 3.99-12.83 2.929-16.82-2.37C90.43 105.921 91.491 98.39 96.79 94.4c18.059-13.432 42.689-13.799 61.14-.91 2.89-4.459 8.368-6.487 13.465-4.983 5.097 1.503 8.598 6.18 8.605 11.493ZM161.59 152.8c3.981 5.297 2.915 12.817-2.38 16.8-8.98 6.734-19.906 10.363-31.13 10.34-10.732 .006-21.205-3.29-30-9.44-2.886 4.467-8.367 6.502-13.469 5.001C79.51 173.999 76.005 169.318 76 164v-20c0-6.627 5.373-12 12-12h20c5.027 .007 9.517 3.146 11.249 7.865 1.732 4.719 .34 10.018-3.489 13.275 9.419 4.569 20.599 3.517 29-2.73 2.547-1.92 5.753-2.747 8.911-2.299 3.158 .448 6.007 2.136 7.919 4.689Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
