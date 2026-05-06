package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorDuotoneIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 168v16h-64v-16c0-26.51-21.49-48-48-48-26.51 0-48 21.49-48 48v16h-64v-16C16 106.144 66.144 56 128 56c61.856 0 112 50.144 112 112Z"),
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
                pathData = parseSvgPathData("M184 168v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-22.091-17.909-40-40-40-22.091 0-40 17.909-40 40v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-30.928 25.072-56 56-56 30.928 0 56 25.072 56 56ZM128 80c-48.578 .055-87.945 39.422-88 88v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16C56 128.236 88.235 96 128 96c39.764 0 72 32.236 72 72v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16C215.945 119.422 176.578 80.055 128 80ZM128 48C61.756 48.072 8.072 101.756 8 168v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16C24 110.562 70.562 64 128 64c57.438 0 104 46.562 104 104v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16C247.928 101.756 194.244 48.072 128 48Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
