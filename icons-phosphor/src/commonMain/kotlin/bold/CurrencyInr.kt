package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorBoldIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 86.62742f, 206.62741f, 92.0f, 200.0f, 92.0f),
                    PathNode.LineTo(172.0f, 92.0f),
                    PathNode.CurveTo(171.96143f, 127.33023f, 143.33023f, 155.96143f, 108.0f, 156.0f),
                    PathNode.LineTo(103.0f, 156.0f),
                    PathNode.LineTo(168.0f, 215.12f),
                    PathNode.CurveTo(171.23274f, 217.98785f, 172.67378f, 222.37239f, 171.77272f, 226.59889f),
                    PathNode.CurveTo(170.87164f, 230.82538f, 167.76764f, 234.24095f, 163.64633f, 235.54092f),
                    PathNode.CurveTo(159.52502f, 236.84093f, 155.02304f, 235.82454f, 151.86f, 232.88f),
                    PathNode.LineTo(63.86f, 152.88f),
                    PathNode.CurveTo(60.181744f, 149.5369f, 58.945236f, 144.27217f, 60.75063f, 139.64113f),
                    PathNode.CurveTo(62.556023f, 135.01012f, 67.02958f, 131.97145f, 72.0f, 132.0f),
                    PathNode.LineTo(108.0f, 132.0f),
                    PathNode.CurveTo(130.09138f, 132.0f, 148.0f, 114.09139f, 148.0f, 92.0f),
                    PathNode.LineTo(72.0f, 92.0f),
                    PathNode.CurveTo(65.37258f, 92.0f, 60.0f, 86.62742f, 60.0f, 80.0f),
                    PathNode.CurveTo(60.0f, 73.37258f, 65.37258f, 68.0f, 72.0f, 68.0f),
                    PathNode.LineTo(140.0f, 68.0f),
                    PathNode.CurveTo(132.44583f, 57.927765f, 120.590294f, 52.0f, 108.0f, 52.0f),
                    PathNode.LineTo(72.0f, 52.0f),
                    PathNode.CurveTo(65.37258f, 52.0f, 60.0f, 46.62742f, 60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 33.37258f, 65.37258f, 28.0f, 72.0f, 28.0f),
                    PathNode.LineTo(200.0f, 28.0f),
                    PathNode.CurveTo(206.62741f, 28.0f, 212.0f, 33.37258f, 212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 46.62742f, 206.62741f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(157.91f, 52.0f),
                    PathNode.CurveTo(161.804f, 56.84834f, 164.97061f, 62.23832f, 167.31f, 68.0f),
                    PathNode.LineTo(200.0f, 68.0f),
                    PathNode.CurveTo(206.62741f, 68.0f, 212.0f, 73.37258f, 212.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
