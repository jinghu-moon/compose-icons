package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileCloudLine: ImageVector
    get() {
        if (_fileCloudLine != null) return _fileCloudLine!!
        _fileCloudLine = remixIcon(
            name = "FileCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.997 2 21 8l.001 4.261c-.579-.48-1.258-.843-2-1.053L19 9h-5v-5h-9v16l5.059 .001c.117 .736 .403 1.416 .818 2L3.993 22c-.509 0-.929-.383-.987-.876L3 21.008v-18.016c0-.498 .387-.926 .885-.985L4.002 2h10.995ZM17.5 13C19.433 13 21 14.567 21 16.5l-.001 .103c1.155 .325 2.001 1.387 2.001 2.647 0 1.462-1.142 2.658-2.583 2.745L20.25 22h-5.5l-.167-.005C13.142 21.908 12 20.712 12 19.25c0-1.26 .847-2.322 2.003-2.647L14 16.5C14 14.567 15.567 13 17.5 13ZM17.5 15c-.731 0-1.34 .523-1.473 1.215l-.02 .14L16 16.5v1.62l-1.444 .406c-.4 .107-.638 .518-.53 .918 .079 .296 .326 .503 .611 .547l.108 .009h5.511c.329-.002 .63-.223 .719-.556 .107-.4-.13-.811-.53-.918l-1.012-.282L19 18.12v-1.62l-.007-.145C18.92 15.595 18.28 15 17.5 15Z"),
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
        return _fileCloudLine!!
    }

private var _fileCloudLine: ImageVector? = null
