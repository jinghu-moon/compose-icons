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
                pathData = parseSvgPathData("M 12.000 12.586 L 16.243 16.828 L 14.828 18.243 L 13.000 16.415 L 13.000 22.000 L 11.000 22.000 L 11.000 16.413 L 9.172 18.243 L 7.757 16.828 L 12.000 12.586 ZM 12.000 2.000 C 15.593 2.000 18.554 4.708 18.954 8.194 C 21.286 8.832 23.000 10.966 23.000 13.500 C 23.000 16.369 20.804 18.725 18.001 18.978 L 18.001 16.964 C 19.697 16.721 21.000 15.263 21.000 13.500 C 21.000 11.567 19.433 10.000 17.500 10.000 C 17.291 10.000 17.087 10.018 16.889 10.054 C 16.962 9.714 17.000 9.362 17.000 9.000 C 17.000 6.239 14.761 4.000 12.000 4.000 C 9.239 4.000 7.000 6.239 7.000 9.000 C 7.000 9.362 7.038 9.714 7.112 10.053 C 6.913 10.018 6.709 10.000 6.500 10.000 C 4.567 10.000 3.000 11.567 3.000 13.500 C 3.000 15.200 4.212 16.617 5.820 16.934 L 6.000 16.965 L 6.000 18.978 C 3.197 18.725 1.000 16.369 1.000 13.500 C 1.000 10.966 2.714 8.832 5.046 8.194 C 5.446 4.708 8.407 2.000 12.000 2.000 Z"),
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
