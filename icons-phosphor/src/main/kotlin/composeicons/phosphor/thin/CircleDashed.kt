package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorThinIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.87 36.06c-.456 1.765-2.047 2.999-3.87 3-.337-.004-.673-.048-1-.13-15.086-3.895-30.914-3.895-46 0-2.101 .458-4.188-.826-4.726-2.907-.538-2.082 .666-4.216 2.726-4.833 16.398-4.23 33.602-4.23 50 0 2.136 .554 3.421 2.733 2.87 4.87ZM56.65 57.94C44.792 70.026 36.191 84.919 31.65 101.23c-.591 2.129 .656 4.334 2.785 4.925 2.129 .591 4.334-.656 4.925-2.785 4.175-15.005 12.088-28.706 23-39.82 1.044-1.01 1.458-2.506 1.082-3.909-.376-1.403-1.482-2.492-2.891-2.845-1.409-.353-2.898 .085-3.891 1.144ZM39.36 152.62c-.591-2.129-2.796-3.376-4.925-2.785-2.129 .591-3.376 2.796-2.785 4.925 4.534 16.32 13.136 31.221 25 43.31 1.549 1.577 4.083 1.599 5.66 .05 1.577-1.549 1.599-4.083 .05-5.66C51.44 181.344 43.526 167.635 39.36 152.62ZM151 217.09c-15.086 3.895-30.914 3.895-46 0-2.14-.552-4.323 .735-4.875 2.875-.552 2.14 .735 4.323 2.875 4.875 16.398 4.234 33.602 4.234 50 0 1.432-.312 2.578-1.383 2.988-2.79 .41-1.407 .017-2.925-1.023-3.957-1.04-1.032-2.561-1.413-3.965-.993ZM221.58 149.84c-2.129-.588-4.332 .661-4.92 2.79-4.177 15.004-12.09 28.704-23 39.82-1.044 1.01-1.458 2.506-1.082 3.909 .376 1.403 1.482 2.492 2.891 2.845 1.409 .353 2.898-.085 3.891-1.144 11.858-12.086 20.459-26.979 25-43.29 .286-1.022 .153-2.116-.368-3.041-.521-.925-1.389-1.604-2.412-1.889ZM216.64 103.38c.591 2.129 2.796 3.376 4.925 2.785 2.129-.591 3.376-2.796 2.785-4.925-4.534-16.32-13.136-31.221-25-43.31-1.549-1.577-4.083-1.599-5.66-.05-1.577 1.549-1.599 4.083-.05 5.66 10.92 11.116 18.834 24.825 23 39.84Z"),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
