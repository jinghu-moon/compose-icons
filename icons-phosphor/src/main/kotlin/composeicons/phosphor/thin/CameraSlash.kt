package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorThinIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L60.78 60h-12.78C36.954 60 28 68.954 28 80v112c0 11.046 8.954 20 20 20h151l6.08 6.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM148.58 156.54c-5.756 4.852-13.052 7.497-20.58 7.46-12.983 .003-24.681-7.84-29.61-19.851-4.929-12.011-2.112-25.81 7.13-34.929ZM48 204c-6.627 0-12-5.373-12-12v-112C36 73.373 41.373 68 48 68h20l32.09 35.3c-15.492 15.032-16.263 39.645-1.741 55.617 14.522 15.972 39.097 17.54 55.531 3.543L191.69 204ZM228 80v106c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-106c0-6.627-5.373-12-12-12h-32c-1.334-.002-2.579-.67-3.32-1.78L157.85 44h-59.72l-.82 1.23c-.772 1.239-2.156 1.959-3.613 1.879-1.457-.08-2.755-.946-3.387-2.262-.632-1.315-.498-2.87 .351-4.058l2-3C93.402 36.67 94.657 35.998 96 36h64c1.338-.001 2.588 .667 3.33 1.78L178.13 60h29.87c11.046 0 20 8.954 20 20Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
