package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DribbbleLine: ImageVector
    get() {
        if (_dribbbleLine != null) return _dribbbleLine!!
        _dribbbleLine = remixIcon(
            name = "DribbbleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.989 11.572C19.903 9.945 19.331 8.447 18.416 7.221c-.241 .263-.538 .549-.921 .871-.908 .763-2.007 1.451-3.312 2.009 .166 .35 .319 .689 .454 1.009l.001 .003c.026 .062 .049 .118 .093 .229 .006 .014 .011 .028 .016 .041 1.514-.17 3.109-.108 4.656 .102 .206 .028 .4 .057 .584 .087ZM10.604 4.121c.174 .245 .356 .507 .576 .832 .613 .905 1.216 1.86 1.78 2.841 .115 .199 .227 .398 .336 .596 1.223-.481 2.233-1.088 3.047-1.766 .329-.274 .594-.532 .797-.755C15.75 4.703 13.957 4 12 4c-.476 0-.942 .042-1.396 .121ZM4.253 9.998c.579-.013 1.232-.048 2.04-.122 1.607-.148 3.248-.413 4.862-.822C10.572 8.037 9.939 7.023 9.295 6.054 8.985 5.588 8.684 5.15 8.455 4.826 6.395 5.846 4.838 7.727 4.253 9.998ZM5.784 17.036c.387-.567 .897-1.205 1.574-1.899 1.454-1.49 3.171-2.65 5.156-3.29 .028-.008 .047-.014 .062-.018-.165-.364-.32-.689-.476-.995-1.836 .535-3.77 .869-5.698 1.042-.94 .084-1.783 .122-2.403 .128 .001 1.907 .669 3.658 1.784 5.032ZM15.005 19.417c-.104-.542-.238-1.146-.415-1.843-.321-1.263-.723-2.562-1.217-3.866-2.002 .727-3.597 1.79-4.83 3.057-.594 .611-1.031 1.189-1.317 1.655C8.559 19.413 10.211 20 12 20c1.063 0 2.077-.207 3.005-.583ZM16.878 18.341c1.53-1.178 2.621-2.897 2.987-4.871-.34-.084-.771-.17-1.246-.236-1.044-.145-2.118-.169-3.179-.033 .452 1.275 .823 2.531 1.12 3.734 .129 .525 .235 1 .317 1.405ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _dribbbleLine!!
    }

private var _dribbbleLine: ImageVector? = null
