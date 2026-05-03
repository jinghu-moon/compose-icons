package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorBoldIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 206.62741f, 230.62741f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(25.372583f, 212.0f, 20.0f, 206.62741f, 20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 193.37259f, 25.372583f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(230.62741f, 188.0f, 236.0f, 193.37259f, 236.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 152.57f),
                    PathNode.CurveTo(18.6314f, 145.57649f, 19.613754f, 137.26544f, 24.52f, 131.25f),
                    PathNode.LineTo(106.16f, 30.43f),
                    PathNode.CurveTo(111.49107f, 23.833128f, 119.51831f, 19.999386f, 128.0f, 19.999386f),
                    PathNode.CurveTo(136.48169f, 19.999386f, 144.50893f, 23.833128f, 149.84f, 30.43f),
                    PathNode.LineTo(231.49f, 131.25f),
                    PathNode.CurveTo(236.36185f, 137.26569f, 237.34618f, 145.5445f, 234.0207f, 152.53482f),
                    PathNode.CurveTo(230.69524f, 159.52515f, 223.651f, 163.98457f, 215.91f, 164.0f),
                    PathNode.LineTo(40.09f, 164.0f),
                    PathNode.CurveTo(32.350338f, 164.03206f, 25.29418f, 159.5737f, 22.0f, 152.57f),
                    PathNode.Close,
                    PathNode.MoveTo(48.3f, 140.0f),
                    PathNode.LineTo(207.7f, 140.0f),
                    PathNode.LineTo(131.2f, 45.53f),
                    PathNode.CurveTo(130.41978f, 44.561977f, 129.2433f, 43.99917f, 128.0f, 43.99917f),
                    PathNode.CurveTo(126.7567f, 43.99917f, 125.580215f, 44.561977f, 124.8f, 45.53f),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
