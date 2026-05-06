package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorThinIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133.17 158.84c27.945-11.954 43.628-41.913 37.527-71.689C164.596 57.375 138.394 35.997 108 35.997c-30.394 0-56.596 21.378-62.697 51.154-6.101 29.776 9.582 59.736 37.527 71.689-23.76 5.46-45.18 18.69-61.89 38.59-.995 1.084-1.315 2.626-.833 4.017 .482 1.39 1.689 2.403 3.141 2.638 1.453 .235 2.917-.347 3.812-1.515C48 177.7 76.71 164 108 164c31.29 0 60 13.7 80.94 38.57 1.448 1.576 3.88 1.733 5.518 .357 1.639-1.376 1.904-3.799 .602-5.497C178.35 177.53 156.93 164.3 133.17 158.84ZM52 100C52 69.072 77.072 44 108 44c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56C77.086 155.967 52.033 130.914 52 100ZM250.83 130.83l-32 32c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-16-16c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L216 154.34l29.17-29.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
