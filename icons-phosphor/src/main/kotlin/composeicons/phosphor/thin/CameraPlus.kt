package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorThinIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 136c0 2.209-1.791 4-4 4h-28v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28h28c2.209 0 4 1.791 4 4ZM228 80v112c0 11.046-8.954 20-20 20h-160C36.954 212 28 203.046 28 192v-112C28 68.954 36.954 60 48 60h29.86L90.3 41.34c2.229-3.342 5.983-5.346 10-5.34h55.44c4.017-.006 7.771 1.998 10 5.34L178.14 60h29.86c11.046 0 20 8.954 20 20ZM220 80c0-6.627-5.373-12-12-12h-32c-1.338 .001-2.588-.667-3.33-1.78L159.05 45.78c-.742-1.113-1.992-1.781-3.33-1.78h-55.44c-1.32 .016-2.547 .682-3.28 1.78L83.33 66.22C82.588 67.333 81.338 68.001 80 68h-32C41.373 68 36 73.373 36 80v112c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12Z"),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
