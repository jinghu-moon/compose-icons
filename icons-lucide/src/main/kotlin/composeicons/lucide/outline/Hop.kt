package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hop: ImageVector
    get() {
        if (_hop != null) return _hop!!
        _hop = lucideOutlineIcon(
            name = "Hop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.82 16.12c1.69 .6 3.91 .79 5.18 .85 .55 .03 1-.42 .97-.97-.06-1.27-.26-3.5-.85-5.18")
            addPathData("M11.5 6.5c1.64 0 5-.38 6.71-1.07 .52-.2 .55-.82 .12-1.17C14.353 1.016 8.566 1.308 4.937 4.937 1.308 8.566 1.016 14.353 4.26 18.33c.35 .43 .96 .4 1.17-.12 .69-1.71 1.07-5.07 1.07-6.71 1.34 .45 3.1 .9 4.88 .62 .379-.061 .674-.361 .73-.74 .3-2.14-.15-3.5-.61-4.88")
            addPathData("M15.62 16.95c.2 .85 .62 2.76 .5 4.28-.017 .216-.124 .416-.295 .549-.171 .133-.391 .188-.605 .151-1.413-.275-2.785-.732-4.08-1.36")
            addPathData("M16.13 21.05c1.65 .63 3.68 .84 4.87 .91 .26 .018 .514-.077 .699-.261 .184-.184 .279-.439 .261-.699-.07-1.658-.373-3.297-.9-4.87")
            addPathData("M16.94 15.62c.86 .2 2.77 .62 4.29 .5 .216-.017 .416-.124 .549-.295 .133-.171 .188-.391 .151-.605-.275-1.413-.732-2.785-1.36-4.08")
            addPathData("M17.99 5.52c1.244 1.354 2.303 2.867 3.15 4.5 .109 .24 .093 .518-.043 .744-.136 .226-.374 .37-.637 .386-2.33 .2-5.3-.32-8.27-1.57")
            addPathData("M4.93 4.93 3 3C2.866 2.868 2.79 2.688 2.79 2.5 2.79 2.312 2.866 2.132 3 2")
            addPathData("M9.58 12.18c1.24 2.98 1.77 5.95 1.57 8.28-.016 .263-.16 .501-.386 .637-.226 .136-.504 .152-.744 .043C8.387 20.293 6.874 19.234 5.52 17.99")
        }
        return _hop!!
    }

private var _hop: ImageVector? = null
