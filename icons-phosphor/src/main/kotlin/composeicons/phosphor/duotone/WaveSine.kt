package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorDuotoneIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128c-52 110.85-78 55.43-104 0ZM24 128h104C102 72.57 76 17.15 24 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M239.24 131.4C217.24 178.2 197.84 200 178.04 200c-25.1 0-40.73-33.32-57.28-68.6C107.7 103.56 92.9 72 78 72 61.6 72 41.69 109.21 31.28 131.4c-1.927 3.911-6.631 5.559-10.577 3.706-3.946-1.853-5.682-6.525-3.903-10.506C38.71 77.8 58.16 56 78 56c25.1 0 40.73 33.32 57.28 68.6C148.3 152.44 163.1 184 178 184c16.4 0 36.31-37.21 46.72-59.4 1.927-3.911 6.631-5.559 10.577-3.706 3.946 1.853 5.682 6.525 3.903 10.506Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
