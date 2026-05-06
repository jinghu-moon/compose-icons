package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FidgetSpinner: ImageVector
    get() {
        if (_fidgetSpinner != null) return _fidgetSpinner!!
        _fidgetSpinner = tablerFilledIcon(
            name = "FidgetSpinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 0c2.01-.001 3.826 1.203 4.608 3.055 .782 1.852 .379 3.992-1.024 5.433l-.012 .012c.678 .692 1.14 1.567 1.33 2.517l.018 .101 .251-.048q.15-.025 .3-.041l.304-.024L18 11c2.625 0 4.803 2.031 4.987 4.649 .184 2.619-1.688 4.934-4.288 5.301-2.599 .368-5.04-1.338-5.589-3.905l-.032-.164-.24 .048c-.184 .031-.37 .052-.556 .062L12 17q-.427 0-.84-.07l-.239-.048-.004 .025c-.33 1.789-1.606 3.257-3.331 3.834l-.22 .068C5.382 21.372 3.257 20.659 2.013 19.014 .77 17.369 .664 15.129 1.746 13.374 2.828 11.619 4.877 10.708 6.905 11.081l.173 .036 .019-.102c.19-.95 .653-1.824 1.331-2.516L8.378 8.447C7.606 7.634 7.129 6.585 7.023 5.469L7.005 5.225 7 5C7 2.239 9.239 0 12 0M18 15c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M6 15c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C7 15.448 6.552 15 6 15M12 10.005c-1.1 0-1.99 .891-1.99 1.99v.02c0 1.099 .891 1.99 1.99 1.99 1.099 0 1.99-.891 1.99-1.99v-.02c0-1.099-.891-1.99-1.99-1.99M12 4c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C13 4.448 12.552 4 12 4"),
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
        return _fidgetSpinner!!
    }

private var _fidgetSpinner: ImageVector? = null
