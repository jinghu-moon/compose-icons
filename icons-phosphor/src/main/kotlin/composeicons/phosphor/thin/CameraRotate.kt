package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorThinIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 60h-29.87L163.32 37.78C162.579 36.67 161.334 36.002 160 36h-64c-1.334 .002-2.579 .67-3.32 1.78L77.85 60h-29.85C36.954 60 28 68.954 28 80v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 68.954 219.046 60 208 60ZM220 192c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-112C36 73.373 41.373 68 48 68h32c1.338 .001 2.588-.667 3.33-1.78L98.13 44h59.72l14.82 22.22c.742 1.113 1.992 1.781 3.33 1.78h32c6.627 0 12 5.373 12 12ZM172 96v24c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h14.66l-5.27-5.52c-12.697-12.57-32.676-13.968-47-3.29-1.136 .936-2.694 1.172-4.056 .615-1.362-.557-2.309-1.817-2.464-3.28-.155-1.464 .506-2.894 1.721-3.725 17.539-13.061 41.996-11.322 57.51 4.09L164 110v-14c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM155.2 157.6c1.325 1.767 .967 4.275-.8 5.6-17.537 13.07-41.999 11.33-57.51-4.09L92 154v14c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-14.66l5.27 5.52c12.697 12.57 32.676 13.968 47 3.29 1.763-1.321 4.262-.968 5.59 .79Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
