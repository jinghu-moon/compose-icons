package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileList3Fill: ImageVector
    get() {
        if (_fileList3Fill != null) return _fileList3Fill!!
        _fileList3Fill = remixIcon(
            name = "FileList3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 L 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 15.000 L 22.000 15.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 ZM 18.000 17.000 L 18.000 19.000 C 18.000 19.552 18.448 20.000 19.000 20.000 C 19.552 20.000 20.000 19.552 20.000 19.000 L 20.000 17.000 L 18.000 17.000 ZM 6.000 7.000 L 6.000 9.000 L 14.000 9.000 L 14.000 7.000 L 6.000 7.000 ZM 6.000 11.000 L 6.000 13.000 L 14.000 13.000 L 14.000 11.000 L 6.000 11.000 ZM 6.000 15.000 L 6.000 17.000 L 11.000 17.000 L 11.000 15.000 L 6.000 15.000 Z"),
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
        return _fileList3Fill!!
    }

private var _fileList3Fill: ImageVector? = null
