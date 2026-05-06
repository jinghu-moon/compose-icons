package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCloudFill: ImageVector
    get() {
        if (_fileCloudFill != null) return _fileCloudFill!!
        _fileCloudFill = remixIcon(
            name = "FileCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.997 2 21 8l.001 4.261C20.05 11.472 18.83 11 17.5 11l-.221 .004c-2.495 .099-4.562 1.859-5.126 4.205l-.016 .074-.029 .019C10.822 16.163 10 17.625 10 19.25c0 1.023 .324 1.973 .877 2.751L3.993 22c-.509 0-.929-.383-.987-.876L3 21.008v-18.016c0-.498 .387-.926 .885-.985L4.002 2h10.995ZM17.5 13C19.433 13 21 14.567 21 16.5l-.001 .103c1.155 .325 2.001 1.387 2.001 2.647 0 1.462-1.142 2.658-2.583 2.745L20.25 22h-5.5l-.167-.005C13.142 21.908 12 20.712 12 19.25c0-1.26 .847-2.322 2.003-2.647L14 16.5C14 14.567 15.567 13 17.5 13Z"),
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
        return _fileCloudFill!!
    }

private var _fileCloudFill: ImageVector? = null
