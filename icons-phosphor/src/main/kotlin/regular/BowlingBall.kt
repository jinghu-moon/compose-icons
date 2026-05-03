package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) return _bowlingBall!!
        _bowlingBall = phosphorRegularIcon(
            name = "BowlingBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 144.000 116.000 C 144.000 122.627 138.627 128.000 132.000 128.000 C 125.373 128.000 120.000 122.627 120.000 116.000 C 120.000 109.373 125.373 104.000 132.000 104.000 C 138.627 104.000 144.000 109.373 144.000 116.000 ZM 164.000 104.000 C 157.373 104.000 152.000 98.627 152.000 92.000 C 152.000 85.373 157.373 80.000 164.000 80.000 C 170.627 80.000 176.000 85.373 176.000 92.000 C 176.000 98.627 170.627 104.000 164.000 104.000 ZM 184.000 132.000 C 184.000 138.627 178.627 144.000 172.000 144.000 C 165.373 144.000 160.000 138.627 160.000 132.000 C 160.000 125.373 165.373 120.000 172.000 120.000 C 178.627 120.000 184.000 125.373 184.000 132.000 Z"),
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
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
