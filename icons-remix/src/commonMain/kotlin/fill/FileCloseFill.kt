package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCloseFill: ImageVector
    get() {
        if (_fileCloseFill != null) return _fileCloseFill!!
        _fileCloseFill = remixIcon(
            name = "FileCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 13.000 C 19.093 13.000 20.117 13.292 21.000 13.803 L 21.000 7.000 L 16.000 2.000 L 3.999 2.000 C 3.447 2.000 3.000 2.444 3.000 2.992 L 3.000 21.008 C 3.000 21.545 3.445 22.000 3.993 22.000 L 12.803 22.000 C 12.292 21.118 12.000 20.093 12.000 19.000 C 12.000 15.686 14.686 13.000 18.000 13.000 ZM 21.536 21.121 L 19.414 19.000 L 21.536 16.879 L 20.121 15.464 L 18.000 17.586 L 15.879 15.464 L 14.465 16.879 L 16.586 19.000 L 14.465 21.121 L 15.879 22.535 L 18.000 20.414 L 20.121 22.535 L 21.536 21.121 Z"),
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
        return _fileCloseFill!!
    }

private var _fileCloseFill: ImageVector? = null
