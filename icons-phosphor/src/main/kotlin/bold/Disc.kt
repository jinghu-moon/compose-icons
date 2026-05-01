package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorBoldIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.32f, 116.0f),
                    PathNode.CurveTo(169.3877f, 112.712166f, 168.07552f, 109.54414f, 166.41f, 106.56f),
                    PathNode.LineTo(195.25f, 77.72f),
                    PathNode.CurveTo(203.67421f, 88.94385f, 209.13553f, 102.10884f, 211.13f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(91.455986f, 212.02316f, 59.089867f, 188.41685f, 47.946945f, 153.6131f),
                    PathNode.CurveTo(36.804028f, 118.80935f, 49.441273f, 80.79457f, 79.2034f, 59.58887f),
                    PathNode.CurveTo(108.96552f, 38.383175f, 149.02303f, 38.852627f, 178.28f, 60.75f),
                    PathNode.LineTo(149.43f, 89.59f),
                    PathNode.CurveTo(133.07178f, 80.45937f, 112.72598f, 82.68784f, 98.73203f, 95.142944f),
                    PathNode.CurveTo(84.73809f, 107.59804f, 80.16514f, 127.54811f, 87.33708f, 144.85484f),
                    PathNode.CurveTo(94.50903f, 162.16159f, 111.85292f, 173.02928f, 130.55487f, 171.93513f),
                    PathNode.CurveTo(149.25682f, 170.84099f, 165.2151f, 158.02498f, 170.32f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(205.117f, 181.29852f, 169.73393f, 211.94427f, 128.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _disc!!
    }

private var _disc: ImageVector? = null
