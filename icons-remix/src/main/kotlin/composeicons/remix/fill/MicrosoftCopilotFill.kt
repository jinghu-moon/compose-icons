package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicrosoftCopilotFill: ImageVector
    get() {
        if (_microsoftCopilotFill != null) return _microsoftCopilotFill!!
        _microsoftCopilotFill = remixIcon(
            name = "MicrosoftCopilotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.865 3.062c.857 0 1.619 .545 1.896 1.355l.602 1.758c.269 .785 .993 1.32 1.817 1.353h.553c.027 0 .054 .003 .08 .003h.073l-.005 .002c3.672 .114 2.36 4.494 1.355 7.781-.859 2.811-2.148 5.623-4.297 5.623h-7.579c-.861 0-1.625-.549-1.9-1.364L6.874 17.834C6.602 17.025 5.848 16.479 4.997 16.47h-.73C.412 16.47 1.744 12.016 2.762 8.686 3.622 5.874 4.911 3.063 7.059 3.062h7.806ZM13.246 7.531c-.812 0-1.535 .489-1.846 1.225-.671 2.273-1.391 4.746-1.829 6.264-.246 .852-1.021 1.439-1.905 1.449h3.077c.862 0 1.623-.551 1.897-1.362 .659-2.235 1.36-4.639 1.789-6.127 .241-.837 .992-1.418 1.857-1.448h-3.041Z"),
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
        return _microsoftCopilotFill!!
    }

private var _microsoftCopilotFill: ImageVector? = null
