package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderCloudLine: ImageVector
    get() {
        if (_folderCloudLine != null) return _folderCloudLine!!
        _folderCloudLine = remixIcon(
            name = "FolderCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h7v-2h-6v-14h5.586l2 2h8.414v4h2v-5C22 5.448 21.552 5 21 5h-8.586l-2-2h-7.414ZM12 18.25c0-1.259 .847-2.321 2.002-2.647C13.945 13.658 15.552 12 17.5 12c1.948 0 3.555 1.658 3.499 3.603 1.155 .326 2.001 1.388 2.001 2.647C23 19.769 21.769 21 20.25 21h-5.5C13.231 21 12 19.769 12 18.25ZM17.5 14C16.672 14 16 14.672 16 15.5c0 .464 .024 .975 .057 1.461C15.093 17.165 14 17.552 14 18.25c0 .414 .336 .75 .75 .75h5.5c.414 0 .75-.336 .75-.75 0-.698-1.093-1.085-2.057-1.289 .033-.485 .057-.997 .057-1.461C19 14.672 18.328 14 17.5 14Z"),
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
        return _folderCloudLine!!
    }

private var _folderCloudLine: ImageVector? = null
