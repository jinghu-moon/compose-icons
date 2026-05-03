package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorThinIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 132.0f),
                    PathNode.LineTo(52.11f, 132.0f),
                    PathNode.CurveTo(54.281525f, 172.34094f, 87.600685f, 203.95221f, 128.0f, 204.0f),
                    PathNode.LineTo(200.0f, 204.0f),
                    PathNode.CurveTo(202.20914f, 204.0f, 204.0f, 205.79086f, 204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(202.20914f, 44.0f, 204.0f, 45.79086f, 204.0f, 48.0f),
                    PathNode.CurveTo(204.0f, 50.20914f, 202.20914f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(128.0f, 52.0f),
                    PathNode.CurveTo(87.600685f, 52.047787f, 54.281525f, 83.65906f, 52.11f, 124.0f),
                    PathNode.LineTo(200.0f, 124.0f),
                    PathNode.CurveTo(202.20914f, 124.0f, 204.0f, 125.79086f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 130.20914f, 202.20914f, 132.0f, 200.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
