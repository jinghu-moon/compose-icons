package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UploadCloud2Line: ImageVector
    get() {
        if (_uploadCloud2Line != null) return _uploadCloud2Line!!
        _uploadCloud2Line = remixIcon(
            name = "UploadCloud2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 12.586l4.243 4.243-1.414 1.414L13 16.415v5.585h-2v-5.587L9.172 18.243 7.757 16.828 12 12.586ZM12 2c3.593 0 6.554 2.708 6.954 6.194C21.286 8.832 23 10.966 23 13.5c0 2.869-2.196 5.225-4.999 5.478l0-2.013C19.697 16.721 21 15.263 21 13.5 21 11.567 19.433 10 17.5 10c-.209 0-.413 .018-.611 .054C16.962 9.714 17 9.362 17 9 17 6.239 14.761 4 12 4 9.239 4 7 6.239 7 9c0 .362 .038 .714 .112 1.053C6.913 10.018 6.709 10 6.5 10 4.567 10 3 11.567 3 13.5c0 1.7 1.212 3.117 2.82 3.434l.18 .031 0 2.013C3.197 18.725 1 16.369 1 13.5 1 10.966 2.714 8.832 5.046 8.194 5.446 4.708 8.407 2 12 2Z"),
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
        return _uploadCloud2Line!!
    }

private var _uploadCloud2Line: ImageVector? = null
