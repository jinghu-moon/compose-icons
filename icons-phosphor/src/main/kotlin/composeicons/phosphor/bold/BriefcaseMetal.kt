package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) return _briefcaseMetal!!
        _briefcaseMetal = phosphorBoldIcon(
            name = "BriefcaseMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-36v-12C180 24.536 167.464 12 152 12h-48C88.536 12 76 24.536 76 40v12h-36C28.954 52 20 60.954 20 72v128c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-128C236 60.954 227.046 52 216 52ZM44 120h168v32h-168ZM100 40c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v12h-56ZM212 76v20h-168v-20ZM44 196v-20h168v20Z"),
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
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
