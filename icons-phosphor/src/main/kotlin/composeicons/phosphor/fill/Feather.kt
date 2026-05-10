package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorFillIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.84 134.81l-59.79 60.47h0c-2.958 2.994-6.991 4.679-11.2 4.68h-65.53L45.66 229.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L56.93 195.76h0L124.7 128h84.3c1.612 .003 3.065 .973 3.685 2.46 .62 1.488 .287 3.202-.845 4.35ZM216.7 30.57C191.267 9.64 154.102 11.431 130.8 34.71l-9.6 9.48c-.756 .741-1.188 1.751-1.2 2.81v63L175 55c3.145-2.988 8.099-2.925 11.167 .143 3.068 3.068 3.131 8.022 .143 11.167L140.71 112h88.38c1.497 .003 2.871-.83 3.56-2.16C246.78 82.974 240.121 49.88 216.7 30.57ZM62.83 167.23 104 126.06v-55.3c-.003-1.612-.973-3.065-2.46-3.685-1.488-.62-3.202-.287-4.35 .845L60.69 104c-3.01 2.993-4.699 7.065-4.69 11.31v49.09c-.001 1.619 .973 3.079 2.469 3.699 1.496 .62 3.217 .277 4.361-.868Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
